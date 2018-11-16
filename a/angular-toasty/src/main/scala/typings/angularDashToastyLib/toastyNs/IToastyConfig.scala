package typings
package angularDashToastyLib.toastyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IToastyConfig extends js.Object {
  /**
           * Whether clicking the toast closes it.
           */
  var clickToClose: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Whether HTML is allowed in toasts.
           */
  var html: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * The toast's message.
           */
  var msg: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Add event handler.
           */
  var onAdd: js.UndefOr[js.Function] = js.undefined
  /**
           * Click event handler.
           */
  var onClick: js.UndefOr[js.Function] = js.undefined
  /**
           * Remove event handler.
           */
  var onRemove: js.UndefOr[js.Function] = js.undefined
  /**
           * Whether to shake the toasts.
           */
  var shake: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Whether to show the 'X' icon to close the toast.
           */
  var showClose: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Whether to play a sound when a toast is added.
           */
  var sound: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * What theme to use.
           * - 'default'
           * - 'material'
           * - 'bootstrap'
           */
  var theme: js.UndefOr[java.lang.String] = js.undefined
  /**
           * How long (in milliseconds) the toast shows before it's removed. Set to false to disable.
           */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /**
           * The toast's title.
           */
  var title: java.lang.String
  /**
           * The toast's type:
           * - 'default'
           * - 'info'
           * - 'success'
           * - 'wait'
           * - 'error'
           * - 'warning'
           */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

