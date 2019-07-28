package typings.awsDashSdk.clientsOpsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EngineAttribute extends js.Object {
  /**
    * The name of the engine attribute. 
    */
  var Name: js.UndefOr[EngineAttributeName] = js.undefined
  /**
    * The value of the engine attribute. 
    */
  var Value: js.UndefOr[EngineAttributeValue] = js.undefined
}

object EngineAttribute {
  @scala.inline
  def apply(Name: EngineAttributeName = null, Value: EngineAttributeValue = null): EngineAttribute = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[EngineAttribute]
  }
}

