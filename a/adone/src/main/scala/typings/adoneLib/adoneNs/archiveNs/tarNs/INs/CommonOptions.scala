package typings
package adoneLib.adoneNs.archiveNs.tarNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CommonOptions extends js.Object {
  /**
                       * Ensure that packed directories have the corresponding modes
                       */
  var dmode: js.UndefOr[scala.Double] = js.undefined
  /**
                       * Ensure that packed files have the corresponding modes
                       */
  var fmode: js.UndefOr[scala.Double] = js.undefined
  /**
                       * Entries filter
                       */
  var ignore: js.UndefOr[js.Function1[/* name */ java.lang.String, scala.Boolean]] = js.undefined
  /**
                       * Header mapper, called for each each entry
                       */
  var map: js.UndefOr[js.Function1[/* header */ Header, js.UndefOr[Header]]] = js.undefined
  /**
                       * Set the dmode and fmode to writable
                       */
  var readable: js.UndefOr[scala.Boolean] = js.undefined
  /**
                       * Strip the parts of paths of files
                       */
  var strip: js.UndefOr[scala.Double] = js.undefined
  /**
                       * A custom umask, process.umask() by default
                       */
  var umask: js.UndefOr[scala.Double] = js.undefined
  /**
                       * Set the dmode and fmode to writable
                       */
  var writable: js.UndefOr[scala.Boolean] = js.undefined
}

