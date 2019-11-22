package typings.atApolloProtobufjs.lightMod

import org.scalablytyped.runtime.StringDictionary
import typings.atApolloProtobufjs.atApolloProtobufjsMod.IEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/protobufjs/light", "Enum")
@js.native
class Enum protected ()
  extends typings.atApolloProtobufjs.atApolloProtobufjsMod.Enum {
  /**
    * Constructs a new enum instance.
    * @param name Unique name within its namespace
    * @param [values] Enum values as an object, by name
    * @param [options] Declared options
    * @param [comment] The comment for this enum
    * @param [comments] The value comments for this enum
    */
  def this(name: String) = this()
  def this(name: String, values: StringDictionary[Double]) = this()
  def this(name: String, values: StringDictionary[Double], options: StringDictionary[js.Any]) = this()
  def this(name: String, values: StringDictionary[Double], options: StringDictionary[js.Any], comment: String) = this()
  def this(
    name: String,
    values: StringDictionary[Double],
    options: StringDictionary[js.Any],
    comment: String,
    comments: StringDictionary[String]
  ) = this()
}

/* static members */
@JSImport("@apollo/protobufjs/light", "Enum")
@js.native
object Enum extends js.Object {
  /**
    * Constructs an enum from an enum descriptor.
    * @param name Enum name
    * @param json Enum descriptor
    * @returns Created enum
    * @throws {TypeError} If arguments are invalid
    */
  def fromJSON(name: String, json: IEnum): typings.atApolloProtobufjs.atApolloProtobufjsMod.Enum = js.native
}

