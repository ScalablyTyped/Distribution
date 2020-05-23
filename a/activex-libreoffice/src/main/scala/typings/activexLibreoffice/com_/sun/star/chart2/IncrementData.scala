package typings.activexLibreoffice.com_.sun.star.chart2

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An {@link IncrementData} describes how tickmarks are positioned on the scale of an axis.
  * @see Axis
  * @see Grid
  * @see Scale
  * @see XScaling
  */
trait IncrementData extends js.Object {
  /**
    * if the any contains a double value this is used as a fixed BaseValue. Otherwise, if the any is empty or contains an incompatible type, the BaseValue
    * is meant to be calculated automatically by the view component representing the model containing this increment.
    */
  var BaseValue: js.Any
  /**
    * if the any contains a double value this is used as a fixed Distance value. Otherwise, if the any is empty or contains an incompatible type, the
    * Distance is meant to be calculated automatically by the view component representing the model containing this increment.
    */
  var Distance: js.Any
  /**
    * {@link PostEquidistant} rules whether the member {@link Distance} describes a distance before or after the scaling is applied.
    *
    * If {@link PostEquidistant} equals `TRUE`{@link Distance} is given in values after {@link XScaling} is applied, thus resulting main tickmarks will
    * always look equidistant on the screen. If {@link PostEquidistant} equals `FALSE`{@link Distance} is given in values before {@link XScaling} is
    * applied.
    */
  var PostEquidistant: js.Any
  /**
    * {@link SubIncrements} describes the positioning of further sub tickmarks on the scale of an axis.
    *
    * The first {@link SubIncrement} in this sequence determines how the distance between two neighboring main tickmarks is divided for positioning of
    * further sub tickmarks. Every following {@link SubIncrement} determines the positions of subsequent tickmarks in relation to their parent tickmarks
    * given by the preceding {@link SubIncrement} .
    */
  var SubIncrements: SafeArray[SubIncrement]
}

object IncrementData {
  @scala.inline
  def apply(
    BaseValue: js.Any,
    Distance: js.Any,
    PostEquidistant: js.Any,
    SubIncrements: SafeArray[SubIncrement]
  ): IncrementData = {
    val __obj = js.Dynamic.literal(BaseValue = BaseValue.asInstanceOf[js.Any], Distance = Distance.asInstanceOf[js.Any], PostEquidistant = PostEquidistant.asInstanceOf[js.Any], SubIncrements = SubIncrements.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncrementData]
  }
}

