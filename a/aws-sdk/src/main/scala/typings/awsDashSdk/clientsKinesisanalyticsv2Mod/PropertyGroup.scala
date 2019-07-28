package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyGroup extends js.Object {
  /**
    * Describes the key of an application execution property key-value pair.
    */
  var PropertyGroupId: Id
  /**
    * Describes the value of an application execution property key-value pair.
    */
  var PropertyMap: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.PropertyMap
}

object PropertyGroup {
  @scala.inline
  def apply(PropertyGroupId: Id, PropertyMap: PropertyMap): PropertyGroup = {
    val __obj = js.Dynamic.literal(PropertyGroupId = PropertyGroupId, PropertyMap = PropertyMap)
  
    __obj.asInstanceOf[PropertyGroup]
  }
}

