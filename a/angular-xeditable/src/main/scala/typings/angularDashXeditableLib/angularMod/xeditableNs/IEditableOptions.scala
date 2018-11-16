package typings
package angularDashXeditableLib.angularMod.xeditableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IEditableOptions extends js.Object {
  /**
                * How input elements get activated. Possible values: `focus|select|none`.
                */
  var activate: java.lang.String
  /*
              * Event, on which the edit mode gets activated.
              * Can be any event.
              */
  var activationEvent: java.lang.String
  /**
                * Default value for `blur` attribute of single editable element.
                * Can be `cancel|submit|ignore`.
                */
  var blurElem: java.lang.String
  /**
                * Default value for `blur` attribute of editable form.
                * Can be `cancel|submit|ignore`.
                */
  var blurForm: java.lang.String
  /**
                * Whether to show buttons for single editalbe element.
                * Possible values `right` (default), `no`.
                */
  var buttons: java.lang.String
  /**
                * Icon Set. Possible values `font-awesome`, `default`.
                */
  var icon_set: java.lang.String
  /**
                * Whether to disable x-editable. Can be overloaded on each element.
              */
  var isDisabled: scala.Boolean
  /**
                * Theme. Possible values `bs3`, `bs2`, `default`
                */
  var theme: java.lang.String
}

