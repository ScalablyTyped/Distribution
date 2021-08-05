package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.sdbc.XResultSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This struct is to be contained in the first notification of an {@link XDynamicResultSet} .
  * @see XDynamicResultSet
  * @see ListEvent
  * @see ListAction
  * @see ListActionType
  */
trait WelcomeDynamicResultSetStruct extends StObject {
  
  /** The static result set containing the new version of result set data. */
  var New: XResultSet
  
  /** The static result set containing the previous version of result set data. */
  var Old: XResultSet
}
object WelcomeDynamicResultSetStruct {
  
  inline def apply(New: XResultSet, Old: XResultSet): WelcomeDynamicResultSetStruct = {
    val __obj = js.Dynamic.literal(New = New.asInstanceOf[js.Any], Old = Old.asInstanceOf[js.Any])
    __obj.asInstanceOf[WelcomeDynamicResultSetStruct]
  }
  
  extension [Self <: WelcomeDynamicResultSetStruct](x: Self) {
    
    inline def setNew(value: XResultSet): Self = StObject.set(x, "New", value.asInstanceOf[js.Any])
    
    inline def setOld(value: XResultSet): Self = StObject.set(x, "Old", value.asInstanceOf[js.Any])
  }
}
