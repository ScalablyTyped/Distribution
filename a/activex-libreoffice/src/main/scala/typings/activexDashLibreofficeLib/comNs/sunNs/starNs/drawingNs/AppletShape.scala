package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This {@link Shape} encapsulates an applet.
  *
  * An applet is a small Java-based program that is executed and rendered embedded in a document.
  */
trait AppletShape extends Shape {
  /**
    * This property specifies one of the following: ;  The name of the class file that contains the compiled applet subclass. ;  The path to the class,
    * including the class file itself.
    */
  var AppletCode: java.lang.String
  /**
    * This property specifies the base URI for the applet.
    *
    * If this property is empty, then it defaults the same base URI as for the current document.
    */
  var AppletCodeBase: java.lang.String
  /** This sequence contains parameters that are passed to the applet when it is initialized. */
  var AppletCommands: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /** This property specifies whether or not the applet can be scripted. */
  var AppletIsScript: scala.Boolean
  /** this is an optional name for the applet. */
  var AppletName: java.lang.String
}

