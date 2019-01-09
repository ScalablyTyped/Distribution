package typings
package aframeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ArrayCrossOrigin extends js.Object {
  var crossOrigin: java.lang.String = js.native
  def loadTexture(url: java.lang.String): threeLib.threeDashCoreMod.Texture = js.native
  def loadTexture(url: java.lang.String, mapping: threeLib.threeDashCoreMod.Mapping): threeLib.threeDashCoreMod.Texture = js.native
  def loadTexture(
    url: java.lang.String,
    mapping: threeLib.threeDashCoreMod.Mapping,
    onLoad: js.Function1[/* texture */ threeLib.threeDashCoreMod.Texture, scala.Unit]
  ): threeLib.threeDashCoreMod.Texture = js.native
  def loadTexture(
    url: java.lang.String,
    mapping: threeLib.threeDashCoreMod.Mapping,
    onLoad: js.Function1[/* texture */ threeLib.threeDashCoreMod.Texture, scala.Unit],
    onError: js.Function1[/* message */ java.lang.String, scala.Unit]
  ): threeLib.threeDashCoreMod.Texture = js.native
  def loadTextureCube(array: js.Array[java.lang.String]): threeLib.threeDashCoreMod.Texture = js.native
  def loadTextureCube(array: js.Array[java.lang.String], mapping: threeLib.threeDashCoreMod.Mapping): threeLib.threeDashCoreMod.Texture = js.native
  def loadTextureCube(
    array: js.Array[java.lang.String],
    mapping: threeLib.threeDashCoreMod.Mapping,
    onLoad: js.Function1[/* texture */ threeLib.threeDashCoreMod.Texture, scala.Unit]
  ): threeLib.threeDashCoreMod.Texture = js.native
  def loadTextureCube(
    array: js.Array[java.lang.String],
    mapping: threeLib.threeDashCoreMod.Mapping,
    onLoad: js.Function1[/* texture */ threeLib.threeDashCoreMod.Texture, scala.Unit],
    onError: js.Function1[/* message */ java.lang.String, scala.Unit]
  ): threeLib.threeDashCoreMod.Texture = js.native
}

