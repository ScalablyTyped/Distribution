package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowDisplayName extends js.Object {
  /**
    * Whether to allow email addresses with display names ("Name <local@domain>"")
    */
  var allowDisplayName: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to allow UTF8 characters in the local part
    */
  var allowUtf8LocalPart: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to require display name
    */
  var requireDisplayName: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to require top-level domain, default `true`
    */
  var requireTld: js.UndefOr[scala.Boolean] = js.undefined
}

