package typings.amqplib.propertiesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessagePropertyHeaders
  extends /* key */ StringDictionary[js.Any] {
  var `x-death`: js.UndefOr[js.Array[XDeath]] = js.undefined
  var `x-first-death-exchange`: js.UndefOr[String] = js.undefined
  var `x-first-death-queue`: js.UndefOr[String] = js.undefined
  var `x-first-death-reason`: js.UndefOr[String] = js.undefined
}

object MessagePropertyHeaders {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    `x-death`: js.Array[XDeath] = null,
    `x-first-death-exchange`: String = null,
    `x-first-death-queue`: String = null,
    `x-first-death-reason`: String = null
  ): MessagePropertyHeaders = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`x-death` != null) __obj.updateDynamic("x-death")(`x-death`)
    if (`x-first-death-exchange` != null) __obj.updateDynamic("x-first-death-exchange")(`x-first-death-exchange`)
    if (`x-first-death-queue` != null) __obj.updateDynamic("x-first-death-queue")(`x-first-death-queue`)
    if (`x-first-death-reason` != null) __obj.updateDynamic("x-first-death-reason")(`x-first-death-reason`)
    __obj.asInstanceOf[MessagePropertyHeaders]
  }
}

