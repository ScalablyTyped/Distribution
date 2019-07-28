package typings.awsDashSdk.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SqlInjectionMatchSetSummary extends js.Object {
  /**
    * The name of the SqlInjectionMatchSet, if any, specified by Id.
    */
  var Name: ResourceName
  /**
    * A unique identifier for a SqlInjectionMatchSet. You use SqlInjectionMatchSetId to get information about a SqlInjectionMatchSet (see GetSqlInjectionMatchSet), update a SqlInjectionMatchSet (see UpdateSqlInjectionMatchSet), insert a SqlInjectionMatchSet into a Rule or delete one from a Rule (see UpdateRule), and delete a SqlInjectionMatchSet from AWS WAF (see DeleteSqlInjectionMatchSet).  SqlInjectionMatchSetId is returned by CreateSqlInjectionMatchSet and by ListSqlInjectionMatchSets.
    */
  var SqlInjectionMatchSetId: ResourceId
}

object SqlInjectionMatchSetSummary {
  @scala.inline
  def apply(Name: ResourceName, SqlInjectionMatchSetId: ResourceId): SqlInjectionMatchSetSummary = {
    val __obj = js.Dynamic.literal(Name = Name, SqlInjectionMatchSetId = SqlInjectionMatchSetId)
  
    __obj.asInstanceOf[SqlInjectionMatchSetSummary]
  }
}

