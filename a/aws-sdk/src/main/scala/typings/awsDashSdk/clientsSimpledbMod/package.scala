package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsSimpledbMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions

  type AttributeList = js.Array[Attribute]
  type AttributeNameList = js.Array[String]
  type Boolean = scala.Boolean
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type DeletableAttributeList = js.Array[DeletableAttribute]
  type DeletableItemList = js.Array[DeletableItem]
  type DomainNameList = js.Array[String]
  type Integer = Double
  type ItemList = js.Array[Item]
  type Long = Double
  type ReplaceableAttributeList = js.Array[ReplaceableAttribute]
  type ReplaceableItemList = js.Array[ReplaceableItem]
  type String = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2009-04-15`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
