package typings
package awsDashSdkLib.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeConstraintSetSummary extends js.Object {
  /**
    * The name of the SizeConstraintSet, if any.
    */
  var Name: ResourceName
  /**
    * A unique identifier for a SizeConstraintSet. You use SizeConstraintSetId to get information about a SizeConstraintSet (see GetSizeConstraintSet), update a SizeConstraintSet (see UpdateSizeConstraintSet), insert a SizeConstraintSet into a Rule or delete one from a Rule (see UpdateRule), and delete a SizeConstraintSet from AWS WAF (see DeleteSizeConstraintSet).  SizeConstraintSetId is returned by CreateSizeConstraintSet and by ListSizeConstraintSets.
    */
  var SizeConstraintSetId: ResourceId
}

object SizeConstraintSetSummary {
  @scala.inline
  def apply(Name: ResourceName, SizeConstraintSetId: ResourceId): SizeConstraintSetSummary = {
    val __obj = js.Dynamic.literal(Name = Name, SizeConstraintSetId = SizeConstraintSetId)
  
    __obj.asInstanceOf[SizeConstraintSetSummary]
  }
}

