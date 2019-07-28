package typings.awsDashSdk.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rule extends js.Object {
  /**
    * A friendly name or description for the metrics for this Rule. The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128 and minimum length one. It can't contain whitespace or metric names reserved for AWS WAF, including "All" and "Default_Action." You can't change MetricName after you create the Rule.
    */
  var MetricName: js.UndefOr[typings.awsDashSdk.clientsWafregionalMod.MetricName] = js.undefined
  /**
    * The friendly name or description for the Rule. You can't change the name of a Rule after you create it.
    */
  var Name: js.UndefOr[ResourceName] = js.undefined
  /**
    * The Predicates object contains one Predicate element for each ByteMatchSet, IPSet, or SqlInjectionMatchSet object that you want to include in a Rule.
    */
  var Predicates: typings.awsDashSdk.clientsWafregionalMod.Predicates
  /**
    * A unique identifier for a Rule. You use RuleId to get more information about a Rule (see GetRule), update a Rule (see UpdateRule), insert a Rule into a WebACL or delete a one from a WebACL (see UpdateWebACL), or delete a Rule from AWS WAF (see DeleteRule).  RuleId is returned by CreateRule and by ListRules.
    */
  var RuleId: ResourceId
}

object Rule {
  @scala.inline
  def apply(
    Predicates: Predicates,
    RuleId: ResourceId,
    MetricName: MetricName = null,
    Name: ResourceName = null
  ): Rule = {
    val __obj = js.Dynamic.literal(Predicates = Predicates, RuleId = RuleId)
    if (MetricName != null) __obj.updateDynamic("MetricName")(MetricName)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[Rule]
  }
}

