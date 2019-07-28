package typings.awsDashSdk.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SqlInjectionMatchSet extends js.Object {
  /**
    * The name, if any, of the SqlInjectionMatchSet.
    */
  var Name: js.UndefOr[ResourceName] = js.undefined
  /**
    * A unique identifier for a SqlInjectionMatchSet. You use SqlInjectionMatchSetId to get information about a SqlInjectionMatchSet (see GetSqlInjectionMatchSet), update a SqlInjectionMatchSet (see UpdateSqlInjectionMatchSet), insert a SqlInjectionMatchSet into a Rule or delete one from a Rule (see UpdateRule), and delete a SqlInjectionMatchSet from AWS WAF (see DeleteSqlInjectionMatchSet).  SqlInjectionMatchSetId is returned by CreateSqlInjectionMatchSet and by ListSqlInjectionMatchSets.
    */
  var SqlInjectionMatchSetId: ResourceId
  /**
    * Specifies the parts of web requests that you want to inspect for snippets of malicious SQL code.
    */
  var SqlInjectionMatchTuples: typings.awsDashSdk.clientsWafregionalMod.SqlInjectionMatchTuples
}

object SqlInjectionMatchSet {
  @scala.inline
  def apply(
    SqlInjectionMatchSetId: ResourceId,
    SqlInjectionMatchTuples: SqlInjectionMatchTuples,
    Name: ResourceName = null
  ): SqlInjectionMatchSet = {
    val __obj = js.Dynamic.literal(SqlInjectionMatchSetId = SqlInjectionMatchSetId, SqlInjectionMatchTuples = SqlInjectionMatchTuples)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[SqlInjectionMatchSet]
  }
}

