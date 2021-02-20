package typings.apolloProtobufjs.lightMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.INamespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object common {
  
  @JSImport("@apollo/protobufjs/light", "common")
  @js.native
  def apply(name: String, json: StringDictionary[js.UndefOr[js.Any]]): Unit = js.native
  
  /**
    * Gets the root definition of the specified common proto file.
    *
    * Bundled definitions are:
    * - google/protobuf/any.proto
    * - google/protobuf/duration.proto
    * - google/protobuf/empty.proto
    * - google/protobuf/field_mask.proto
    * - google/protobuf/struct.proto
    * - google/protobuf/timestamp.proto
    * - google/protobuf/wrappers.proto
    *
    * @param file Proto file name
    * @returns Root definition or `null` if not defined
    */
  @JSImport("@apollo/protobufjs/light", "common.get")
  @js.native
  def get(file: String): INamespace | Null = js.native
}
