package typings.aframe

import org.scalablytyped.runtime.Instantiable3
import typings.three.threeMod.KeyframeTrack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassKeyframeTrack
  extends Instantiable3[
      /* name */ String, 
      /* times */ js.Array[js.Any], 
      /* values */ js.Array[js.Any], 
      KeyframeTrack
    ] {
  def parse(json: js.Any): typings.three.srcAnimationKeyframeTrackMod.KeyframeTrack = js.native
  def toJSON(track: typings.three.srcAnimationKeyframeTrackMod.KeyframeTrack): js.Any = js.native
}

