package typings.appBuilderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object coreMod {
  
  type Publish = typings.builderUtilRuntime.publishOptionsMod.AllPublishOptions | typings.appBuilderLib.snapStorePublisherMod.SnapStoreOptions | (js.Array[
    typings.builderUtilRuntime.publishOptionsMod.AllPublishOptions | typings.appBuilderLib.snapStorePublisherMod.SnapStoreOptions
  ]) | scala.Null
  
  type TargetConfigType = (js.Array[java.lang.String | typings.appBuilderLib.coreMod.TargetConfiguration]) | java.lang.String | typings.appBuilderLib.coreMod.TargetConfiguration | scala.Null
}
