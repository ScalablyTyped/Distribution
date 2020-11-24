package typings.apolloProtobufjs.minimalMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.apolloProtobufjsStrings.bool
import typings.apolloProtobufjs.apolloProtobufjsStrings.bytes
import typings.apolloProtobufjs.apolloProtobufjsStrings.double
import typings.apolloProtobufjs.apolloProtobufjsStrings.fixed32
import typings.apolloProtobufjs.apolloProtobufjsStrings.fixed64
import typings.apolloProtobufjs.apolloProtobufjsStrings.float
import typings.apolloProtobufjs.apolloProtobufjsStrings.int32
import typings.apolloProtobufjs.apolloProtobufjsStrings.int64
import typings.apolloProtobufjs.apolloProtobufjsStrings.sfixed32
import typings.apolloProtobufjs.apolloProtobufjsStrings.sfixed64
import typings.apolloProtobufjs.apolloProtobufjsStrings.sint32
import typings.apolloProtobufjs.apolloProtobufjsStrings.sint64
import typings.apolloProtobufjs.apolloProtobufjsStrings.string
import typings.apolloProtobufjs.apolloProtobufjsStrings.uint32
import typings.apolloProtobufjs.apolloProtobufjsStrings.uint64
import typings.apolloProtobufjs.mod.Buffer
import typings.apolloProtobufjs.mod.Constructor
import typings.apolloProtobufjs.mod.FieldDecorator
import typings.apolloProtobufjs.mod.IMapField
import typings.long.mod.Long
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/protobufjs/minimal", "MapField")
@js.native
class MapField protected ()
  extends typings.apolloProtobufjs.mod.MapField {
  /**
    * Constructs a new map field instance.
    * @param name Unique name within its namespace
    * @param id Unique id within its namespace
    * @param keyType Key type
    * @param type Value type
    * @param [options] Declared options
    * @param [comment] Comment associated with this field
    */
  def this(name: String, id: Double, keyType: String, `type`: String) = this()
  def this(
    name: String,
    id: Double,
    keyType: String,
    `type`: String,
    options: StringDictionary[js.UndefOr[js.Any]]
  ) = this()
  def this(
    name: String,
    id: Double,
    keyType: String,
    `type`: String,
    options: js.UndefOr[scala.Nothing],
    comment: String
  ) = this()
  def this(
    name: String,
    id: Double,
    keyType: String,
    `type`: String,
    options: StringDictionary[js.UndefOr[js.Any]],
    comment: String
  ) = this()
}
/* static members */
@JSImport("@apollo/protobufjs/minimal", "MapField")
@js.native
object MapField extends js.Object {
  
  /**
    * Map field decorator (TypeScript).
    * @param fieldId Field id
    * @param fieldKeyType Field key type
    * @param fieldValueType Field value type
    * @returns Decorator function
    */
  def d[T /* <: StringDictionary[
    Double | Long | String | Boolean | Uint8Array | Buffer | js.Array[Double] | typings.apolloProtobufjs.mod.Message[js.Object]
  ] */](
    fieldId: Double,
    fieldKeyType: int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | bool | string,
    fieldValueType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | bool | string | bytes | js.Object | Constructor[js.Object]
  ): FieldDecorator = js.native
  
  /**
    * Constructs a map field from a map field descriptor.
    * @param name Field name
    * @param json Map field descriptor
    * @returns Created map field
    * @throws {TypeError} If arguments are invalid
    */
  def fromJSON(name: String, json: IMapField): typings.apolloProtobufjs.mod.MapField = js.native
}
