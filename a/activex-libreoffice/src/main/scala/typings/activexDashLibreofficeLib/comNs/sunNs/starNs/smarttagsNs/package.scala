package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object smarttagsNs {
  /**
    * provides one or more actions for smart tags.
    *
    * An implementation of this service defines one or more actions that can be performed for a smart tag which has been recognized by a {@link
    * SmartTagRecognizer} service.
    * @since OOo 2.3
    */
  type SmartTagAction = XSmartTagAction
  /**
    * recognizes smart tags.
    *
    * Implementations of this service are used to scan the document text for smart tags. Smart tags are pieces of text that can be associated with specific
    * actions which are defined by implementations of the {@link SmartTagAction} service.
    * @since OOo 2.3
    */
  type SmartTagRecognizer = XSmartTagRecognizer
}
