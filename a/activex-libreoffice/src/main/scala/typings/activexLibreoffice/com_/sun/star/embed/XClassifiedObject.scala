package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents common functionality for embedded objects */
trait XClassifiedObject
  extends StObject
     with XInterface {
  
  /**
    * retrieves class ID of the object.
    * @returns unique class ID of the object
    */
  val ClassID: SafeArray[Double]
  
  /**
    * retrieves symbolic name for the object type to be used in UI.
    * @returns the symbolic name for the object
    */
  val ClassName: String
  
  /**
    * retrieves class ID of the object.
    * @returns unique class ID of the object
    */
  def getClassID(): SafeArray[Double]
  
  /**
    * retrieves symbolic name for the object type to be used in UI.
    * @returns the symbolic name for the object
    */
  def getClassName(): String
  
  /**
    * sets the class ID and symbolic name to an object.
    * @param aClassID the new class ID
    * @param sClassName the new symbolic name
    * @throws com::sun::star::lang::NoSupportException in case changing of class information is not allowed
    */
  def setClassInfo(aClassID: SeqEquiv[Double], sClassName: String): Unit
}
object XClassifiedObject {
  
  inline def apply(
    ClassID: SafeArray[Double],
    ClassName: String,
    acquire: () => Unit,
    getClassID: () => SafeArray[Double],
    getClassName: () => String,
    queryInterface: `type` => Any,
    release: () => Unit,
    setClassInfo: (SeqEquiv[Double], String) => Unit
  ): XClassifiedObject = {
    val __obj = js.Dynamic.literal(ClassID = ClassID.asInstanceOf[js.Any], ClassName = ClassName.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getClassID = js.Any.fromFunction0(getClassID), getClassName = js.Any.fromFunction0(getClassName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setClassInfo = js.Any.fromFunction2(setClassInfo))
    __obj.asInstanceOf[XClassifiedObject]
  }
  
  extension [Self <: XClassifiedObject](x: Self) {
    
    inline def setClassID(value: SafeArray[Double]): Self = StObject.set(x, "ClassID", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: String): Self = StObject.set(x, "ClassName", value.asInstanceOf[js.Any])
    
    inline def setGetClassID(value: () => SafeArray[Double]): Self = StObject.set(x, "getClassID", js.Any.fromFunction0(value))
    
    inline def setGetClassName(value: () => String): Self = StObject.set(x, "getClassName", js.Any.fromFunction0(value))
    
    inline def setSetClassInfo(value: (SeqEquiv[Double], String) => Unit): Self = StObject.set(x, "setClassInfo", js.Any.fromFunction2(value))
  }
}
