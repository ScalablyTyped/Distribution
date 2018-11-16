package typings
package annyangLib.annyangMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StartOptions extends js.Object {
  /**
       * Should annyang restart itself if it is closed indirectly, because of silence or window conflicts?
       */
  var autoRestart: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Allow forcing continuous mode on or off. Annyang is pretty smart about this, so only set this if you know what you're doing.
       */
  var continuous: js.UndefOr[scala.Boolean] = js.undefined
}

