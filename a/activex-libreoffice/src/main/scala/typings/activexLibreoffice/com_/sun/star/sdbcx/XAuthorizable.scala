package typings.activexLibreoffice.com_.sun.star.sdbcx

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is used for accessing and setting the permissions of a user for a database object.
  * @see com.sun.star.sdbcx.PrivilegeObject
  * @see com.sun.star.sdbcx.Privilege
  */
trait XAuthorizable
  extends StObject
     with XInterface {
  
  /**
    * retrieves the permissions for a specific object, which could be granted to other users and groups.
    * @param objName the name of the object
    * @param objType a value of {@link com.sun.star.sdbcx.PrivilegeObject}
    * @returns the grant privileges
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getGrantablePrivileges(objName: String, objType: Double): Double
  
  /**
    * retrieves the permissions for a specific object.
    * @param objName the name of the object
    * @param objType a value of {@link com.sun.star.sdbcx.PrivilegeObject}
    * @returns the privileges
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getPrivileges(objName: String, objType: Double): Double
  
  /**
    * adds additional permissions for a specific object.
    * @param objName the name of the object
    * @param objType a value from the {@link com.sun.star.sdbcx.PrivilegeObject} constants group
    * @param objPrivileges a value from the {@link com.sun.star.sdbcx.Privilege} constants group
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def grantPrivileges(objName: String, objType: Double, objPrivileges: Double): Unit
  
  /**
    * removes permissions for a specific object from a group or user.
    * @param objName the name of the object
    * @param objType a value from the {@link com.sun.star.sdbcx.PrivilegeObject} constants group
    * @param objPrivileges a value from the {@link com.sun.star.sdbcx.Privilege} constants group
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def revokePrivileges(objName: String, objType: Double, objPrivileges: Double): Unit
}
object XAuthorizable {
  
  inline def apply(
    acquire: () => Unit,
    getGrantablePrivileges: (String, Double) => Double,
    getPrivileges: (String, Double) => Double,
    grantPrivileges: (String, Double, Double) => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    revokePrivileges: (String, Double, Double) => Unit
  ): XAuthorizable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getGrantablePrivileges = js.Any.fromFunction2(getGrantablePrivileges), getPrivileges = js.Any.fromFunction2(getPrivileges), grantPrivileges = js.Any.fromFunction3(grantPrivileges), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), revokePrivileges = js.Any.fromFunction3(revokePrivileges))
    __obj.asInstanceOf[XAuthorizable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XAuthorizable] (val x: Self) extends AnyVal {
    
    inline def setGetGrantablePrivileges(value: (String, Double) => Double): Self = StObject.set(x, "getGrantablePrivileges", js.Any.fromFunction2(value))
    
    inline def setGetPrivileges(value: (String, Double) => Double): Self = StObject.set(x, "getPrivileges", js.Any.fromFunction2(value))
    
    inline def setGrantPrivileges(value: (String, Double, Double) => Unit): Self = StObject.set(x, "grantPrivileges", js.Any.fromFunction3(value))
    
    inline def setRevokePrivileges(value: (String, Double, Double) => Unit): Self = StObject.set(x, "revokePrivileges", js.Any.fromFunction3(value))
  }
}
