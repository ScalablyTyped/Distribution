package typings.atApolloProtobufjs.atApolloProtobufjsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atApolloProtobufjs.atApolloProtobufjsStrings.bool
import typings.atApolloProtobufjs.atApolloProtobufjsStrings.bytes
import typings.atApolloProtobufjs.atApolloProtobufjsStrings.double
import typings.atApolloProtobufjs.atApolloProtobufjsStrings.fixed32
import typings.atApolloProtobufjs.atApolloProtobufjsStrings.fixed64
import typings.atApolloProtobufjs.atApolloProtobufjsStrings.float
import typings.atApolloProtobufjs.atApolloProtobufjsStrings.int32
import typings.atApolloProtobufjs.atApolloProtobufjsStrings.int64
import typings.atApolloProtobufjs.atApolloProtobufjsStrings.sfixed32
import typings.atApolloProtobufjs.atApolloProtobufjsStrings.sfixed64
import typings.atApolloProtobufjs.atApolloProtobufjsStrings.sint32
import typings.atApolloProtobufjs.atApolloProtobufjsStrings.sint64
import typings.atApolloProtobufjs.atApolloProtobufjsStrings.string
import typings.atApolloProtobufjs.atApolloProtobufjsStrings.uint32
import typings.atApolloProtobufjs.atApolloProtobufjsStrings.uint64
import typings.long.longMod.^
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/protobufjs", "MapField")
@js.native
class MapField protected () extends FieldBase {
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
  def this(name: String, id: Double, keyType: String, `type`: String, options: StringDictionary[js.Any]) = this()
  def this(
    name: String,
    id: Double,
    keyType: String,
    `type`: String,
    options: StringDictionary[js.Any],
    comment: String
  ) = this()
  /** Key type. */
  var keyType: String = js.native
  /** Resolved key type if not a basic type. */
  var resolvedKeyType: ReflectionObject | Null = js.native
}

/* static members */
@JSImport("@apollo/protobufjs", "MapField")
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
    Double | ^  | String | Boolean | Uint8Array | Buffer | js.Array[Double] | Message[js.Object]
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
  def fromJSON(name: String, json: IMapField): MapField = js.native
}

