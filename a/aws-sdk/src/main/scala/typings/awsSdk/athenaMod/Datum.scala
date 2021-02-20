package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Datum extends StObject {
  
  /**
    * The value of the datum.
    */
  var VarCharValue: js.UndefOr[datumString] = js.native
}
object Datum {
  
  @scala.inline
  def apply(): Datum = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Datum]
  }
  
  @scala.inline
  implicit class DatumMutableBuilder[Self <: Datum] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVarCharValue(value: datumString): Self = StObject.set(x, "VarCharValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVarCharValueUndefined: Self = StObject.set(x, "VarCharValue", js.undefined)
  }
}
