package typings
package alexaDashSdkLib.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListItemObject extends js.Object {
  /**
       * created time (ISO 8601 time format with time zone)
       */
  var createdTime: stdLib.Date
  /**
       *  URL to retrieve the item (String)
       */
  var href: js.UndefOr[java.lang.String] = js.undefined
  /**
       * item id (String, limit 60 characters)
       */
  var id: java.lang.String
  /**
       * item status
       */
  var status: js.UndefOr[ListItemObjectStatus] = js.undefined
  /**
       * updated time (ISO 8601 time format with time zone)
       */
  var updatedTime: stdLib.Date
  /**
       * item value (String, limit is 256 characters)
       */
  var value: java.lang.String
  /**
       * item version (Positive integer)
       */
  var version: scala.Double
}

