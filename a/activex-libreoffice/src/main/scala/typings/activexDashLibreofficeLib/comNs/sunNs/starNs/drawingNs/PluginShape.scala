package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This {@link Shape} encapsulates a plugin.
  *
  * A plugin is a binary object that is plugged into a document to represent a media-type that is not handled natively by the application.
  */
trait PluginShape extends Shape {
  /** This sequence contains parameters that are passed to the application that renders the plugin when it is initialized. */
  var PluginCommands: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /** This property specifies the media-type to which this plugin should be registered. */
  var PluginMimeType: java.lang.String
  /** This property specifies the url to the binary object. */
  var PluginURL: java.lang.String
}

