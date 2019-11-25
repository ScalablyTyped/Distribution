package typings.amapDashJsDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var id: Double
  var name: String
  var position: js.Tuple2[Double | String, Double | String]
  var rank: js.UndefOr[Double] = js.undefined
  var txt: js.UndefOr[String] = js.undefined
  var zooms: js.Tuple2[Double, Double]
}

object Anon_Id {
  @scala.inline
  def apply(
    id: Double,
    name: String,
    position: js.Tuple2[Double | String, Double | String],
    zooms: js.Tuple2[Double, Double],
    rank: Int | Double = null,
    txt: String = null
  ): Anon_Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], zooms = zooms.asInstanceOf[js.Any])
    if (rank != null) __obj.updateDynamic("rank")(rank.asInstanceOf[js.Any])
    if (txt != null) __obj.updateDynamic("txt")(txt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Id]
  }
}

