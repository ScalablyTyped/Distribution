package typings.ariClient.mod

import typings.ariClient.anon.FormatLang
import typings.ariClient.anon.SoundId
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sounds extends js.Object {
  def get(params: SoundId): js.Promise[Sound] = js.native
  def get(params: SoundId, callback: js.Function2[/* err */ Error, /* sound */ Sound, Unit]): Unit = js.native
  def list(): js.Promise[js.Array[Sound]] = js.native
  def list(callback: js.Function2[/* err */ Error, /* sounds */ js.Array[Sound], Unit]): Unit = js.native
  def list(params: FormatLang): js.Promise[js.Array[Sound]] = js.native
  /* Methods */
  def list(params: FormatLang, callback: js.Function2[/* err */ Error, /* sounds */ js.Array[Sound], Unit]): Unit = js.native
}

