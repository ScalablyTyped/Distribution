package typings.algoliasearchHelper.mod.SearchParameters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ k in algoliasearch-helper.algoliasearch-helper.SearchParameters.Operator ]:? std.Array<number | std.Array<number>>} */
trait OperatorList extends js.Object {
  @JSName("=")
  var Equalssign: js.UndefOr[js.Array[Double | js.Array[Double]]] = js.undefined
  @JSName("!=")
  var ExclamationmarkEqualssign: js.UndefOr[js.Array[Double | js.Array[Double]]] = js.undefined
  @JSName(">")
  var Greaterthansign: js.UndefOr[js.Array[Double | js.Array[Double]]] = js.undefined
  @JSName(">=")
  var GreaterthansignEqualssign: js.UndefOr[js.Array[Double | js.Array[Double]]] = js.undefined
  @JSName("<")
  var Lessthansign: js.UndefOr[js.Array[Double | js.Array[Double]]] = js.undefined
  @JSName("<=")
  var LessthansignEqualssign: js.UndefOr[js.Array[Double | js.Array[Double]]] = js.undefined
}

object OperatorList {
  @scala.inline
  def apply(
    Equalssign: js.Array[Double | js.Array[Double]] = null,
    ExclamationmarkEqualssign: js.Array[Double | js.Array[Double]] = null,
    Greaterthansign: js.Array[Double | js.Array[Double]] = null,
    GreaterthansignEqualssign: js.Array[Double | js.Array[Double]] = null,
    Lessthansign: js.Array[Double | js.Array[Double]] = null,
    LessthansignEqualssign: js.Array[Double | js.Array[Double]] = null
  ): OperatorList = {
    val __obj = js.Dynamic.literal()
    if (Equalssign != null) __obj.updateDynamic("=")(Equalssign.asInstanceOf[js.Any])
    if (ExclamationmarkEqualssign != null) __obj.updateDynamic("!=")(ExclamationmarkEqualssign.asInstanceOf[js.Any])
    if (Greaterthansign != null) __obj.updateDynamic(">")(Greaterthansign.asInstanceOf[js.Any])
    if (GreaterthansignEqualssign != null) __obj.updateDynamic(">=")(GreaterthansignEqualssign.asInstanceOf[js.Any])
    if (Lessthansign != null) __obj.updateDynamic("<")(Lessthansign.asInstanceOf[js.Any])
    if (LessthansignEqualssign != null) __obj.updateDynamic("<=")(LessthansignEqualssign.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperatorList]
  }
}

