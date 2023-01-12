package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JoinKeyProperties extends StObject {
  
  /**
    * A value that indicates that a row in a table is uniquely identified by the columns in a join key. This is used by Amazon QuickSight to optimize query performance.
    */
  var UniqueKey: js.UndefOr[Boolean] = js.undefined
}
object JoinKeyProperties {
  
  inline def apply(): JoinKeyProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JoinKeyProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JoinKeyProperties] (val x: Self) extends AnyVal {
    
    inline def setUniqueKey(value: Boolean): Self = StObject.set(x, "UniqueKey", value.asInstanceOf[js.Any])
    
    inline def setUniqueKeyUndefined: Self = StObject.set(x, "UniqueKey", js.undefined)
  }
}
