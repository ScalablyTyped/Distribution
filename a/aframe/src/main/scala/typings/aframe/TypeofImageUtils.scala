package typings.aframe

import typings.three.srcConstantsMod.Mapping
import typings.three.srcTexturesTextureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofImageUtils extends js.Object {
  var crossOrigin: String = js.native
  def loadTexture(url: String): Texture = js.native
  def loadTexture(url: String, mapping: Mapping): Texture = js.native
  def loadTexture(url: String, mapping: Mapping, onLoad: js.Function1[/* texture */ Texture, Unit]): Texture = js.native
  def loadTexture(
    url: String,
    mapping: Mapping,
    onLoad: js.Function1[/* texture */ Texture, Unit],
    onError: js.Function1[/* message */ String, Unit]
  ): Texture = js.native
  def loadTextureCube(array: js.Array[String]): Texture = js.native
  def loadTextureCube(array: js.Array[String], mapping: Mapping): Texture = js.native
  def loadTextureCube(array: js.Array[String], mapping: Mapping, onLoad: js.Function1[/* texture */ Texture, Unit]): Texture = js.native
  def loadTextureCube(
    array: js.Array[String],
    mapping: Mapping,
    onLoad: js.Function1[/* texture */ Texture, Unit],
    onError: js.Function1[/* message */ String, Unit]
  ): Texture = js.native
}

