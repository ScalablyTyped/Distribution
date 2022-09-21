package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the collection of members of a data pilot source level.
  * @see com.sun.star.sheet.DataPilotSourceLevel
  * @see com.sun.star.sheet.DataPilotSource
  */
trait XMembersSupplier
  extends StObject
     with XInterface {
  
  /**
    * returns the collection of members.
    * @see com.sun.star.sheet.DataPilotSourceMembers
    */
  val Members: XMembersAccess
  
  /**
    * returns the collection of members.
    * @see com.sun.star.sheet.DataPilotSourceMembers
    */
  def getMembers(): XMembersAccess
}
object XMembersSupplier {
  
  inline def apply(
    Members: XMembersAccess,
    acquire: () => Unit,
    getMembers: () => XMembersAccess,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XMembersSupplier = {
    val __obj = js.Dynamic.literal(Members = Members.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getMembers = js.Any.fromFunction0(getMembers), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XMembersSupplier]
  }
  
  extension [Self <: XMembersSupplier](x: Self) {
    
    inline def setGetMembers(value: () => XMembersAccess): Self = StObject.set(x, "getMembers", js.Any.fromFunction0(value))
    
    inline def setMembers(value: XMembersAccess): Self = StObject.set(x, "Members", value.asInstanceOf[js.Any])
  }
}
