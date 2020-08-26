package typings.algoliasearchHelper.mod.SearchParameters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ k in algoliasearch-helper.algoliasearch-helper.SearchParameters.Operator ]:? std.Array<number | std.Array<number>>} */
@js.native
trait OperatorList extends js.Object {
  @JSName("=")
  var Equalssign: js.UndefOr[js.Array[Double | js.Array[Double]]] = js.native
  @JSName("!=")
  var ExclamationmarkEqualssign: js.UndefOr[js.Array[Double | js.Array[Double]]] = js.native
  @JSName(">")
  var Greaterthansign: js.UndefOr[js.Array[Double | js.Array[Double]]] = js.native
  @JSName(">=")
  var GreaterthansignEqualssign: js.UndefOr[js.Array[Double | js.Array[Double]]] = js.native
  @JSName("<")
  var Lessthansign: js.UndefOr[js.Array[Double | js.Array[Double]]] = js.native
  @JSName("<=")
  var LessthansignEqualssign: js.UndefOr[js.Array[Double | js.Array[Double]]] = js.native
}

object OperatorList {
  @scala.inline
  def apply(): OperatorList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperatorList]
  }
  @scala.inline
  implicit class OperatorListOps[Self <: OperatorList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEqualssignVarargs(value: (Double | js.Array[Double])*): Self = this.set("=", js.Array(value :_*))
    @scala.inline
    def setEqualssign(value: js.Array[Double | js.Array[Double]]): Self = this.set("=", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEqualssign: Self = this.set("=", js.undefined)
    @scala.inline
    def setExclamationmarkEqualssignVarargs(value: (Double | js.Array[Double])*): Self = this.set("!=", js.Array(value :_*))
    @scala.inline
    def setExclamationmarkEqualssign(value: js.Array[Double | js.Array[Double]]): Self = this.set("!=", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclamationmarkEqualssign: Self = this.set("!=", js.undefined)
    @scala.inline
    def setGreaterthansignVarargs(value: (Double | js.Array[Double])*): Self = this.set(">", js.Array(value :_*))
    @scala.inline
    def setGreaterthansign(value: js.Array[Double | js.Array[Double]]): Self = this.set(">", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGreaterthansign: Self = this.set(">", js.undefined)
    @scala.inline
    def setGreaterthansignEqualssignVarargs(value: (Double | js.Array[Double])*): Self = this.set(">=", js.Array(value :_*))
    @scala.inline
    def setGreaterthansignEqualssign(value: js.Array[Double | js.Array[Double]]): Self = this.set(">=", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGreaterthansignEqualssign: Self = this.set(">=", js.undefined)
    @scala.inline
    def setLessthansignVarargs(value: (Double | js.Array[Double])*): Self = this.set("<", js.Array(value :_*))
    @scala.inline
    def setLessthansign(value: js.Array[Double | js.Array[Double]]): Self = this.set("<", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLessthansign: Self = this.set("<", js.undefined)
    @scala.inline
    def setLessthansignEqualssignVarargs(value: (Double | js.Array[Double])*): Self = this.set("<=", js.Array(value :_*))
    @scala.inline
    def setLessthansignEqualssign(value: js.Array[Double | js.Array[Double]]): Self = this.set("<=", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLessthansignEqualssign: Self = this.set("<=", js.undefined)
  }
  
}

