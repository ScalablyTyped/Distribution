package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeographicTransformation extends js.Object {
  /**
    * Geographic transformation steps. Each step represents a geographic transformation that will be used in the process of transforming coordinates from one geographic coordinate system to another.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-GeographicTransformation.html#steps)
    */
  var steps: js.Array[GeographicTransformationStep]
  /**
    * Returns the inverse of the geographic transformation calling this method or `null` if the transformation is not invertible. The inverse of a transformation converts coordinates using the same method and parameters, but in the opposite direction of the original object. For example if the original object represents the `NAD_1983_HARN_To_NAD_1983_NSRS2007_1` transformation, then the inverse will transform from `NAD 83 (NSRS 2007)` to `NAD 83 (HARN)`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-GeographicTransformation.html#getInverse)
    *
    *
    */
  def getInverse(): GeographicTransformation
}

object GeographicTransformation {
  @scala.inline
  def apply(getInverse: () => GeographicTransformation, steps: js.Array[GeographicTransformationStep]): GeographicTransformation = {
    val __obj = js.Dynamic.literal(getInverse = js.Any.fromFunction0(getInverse), steps = steps)
  
    __obj.asInstanceOf[GeographicTransformation]
  }
}

