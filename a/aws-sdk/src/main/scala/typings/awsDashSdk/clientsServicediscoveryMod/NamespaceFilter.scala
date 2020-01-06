package typings.awsDashSdk.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamespaceFilter extends js.Object {
  /**
    * The operator that you want to use to determine whether ListNamespaces returns a namespace. Valid values for condition include:    EQ: When you specify EQ for the condition, you can choose to list only public namespaces or private namespaces, but not both. EQ is the default condition and can be omitted.    IN: When you specify IN for the condition, you can choose to list public namespaces, private namespaces, or both.     BETWEEN: Not applicable  
    */
  var Condition: js.UndefOr[FilterCondition] = js.native
  /**
    * Specify TYPE.
    */
  var Name: NamespaceFilterName = js.native
  /**
    * If you specify EQ for Condition, specify either DNS_PUBLIC or DNS_PRIVATE. If you specify IN for Condition, you can specify DNS_PUBLIC, DNS_PRIVATE, or both.
    */
  var Values: FilterValues = js.native
}

object NamespaceFilter {
  @scala.inline
  def apply(Name: NamespaceFilterName, Values: FilterValues, Condition: FilterCondition = null): NamespaceFilter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    if (Condition != null) __obj.updateDynamic("Condition")(Condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamespaceFilter]
  }
}

