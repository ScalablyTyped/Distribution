package typings.activexLibreoffice.com_.sun.star.configuration.backend

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This structure contains all the information related to a property
  * @see XLayerContentDescriber
  */
trait PropertyInfo extends js.Object {
  /** The full name of the Property for eg. org.openoffice.Inet/Settings/ooInetHTTPProxyName */
  var Name: String
  /** Is the property protected, if true the property can not be over written in later layer. */
  var Protected: Boolean
  /** The type of the Property */
  var Type: String
  /** The value of the property */
  var Value: js.Any
}

object PropertyInfo {
  @scala.inline
  def apply(Name: String, Protected: Boolean, Type: String, Value: js.Any): PropertyInfo = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Protected = Protected.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyInfo]
  }
}

