package typings
package awsDashSdkLib.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityType extends js.Object {
  /**
    * The name of this activity.  The combination of activity type name and version must be unique within a domain. 
    */
  var name: Name
  /**
    * The version of this activity.  The combination of activity type name and version must be unique with in a domain. 
    */
  var version: Version
}

object ActivityType {
  @scala.inline
  def apply(name: Name, version: Version): ActivityType = {
    val __obj = js.Dynamic.literal(name = name, version = version)
  
    __obj.asInstanceOf[ActivityType]
  }
}

