package typings.atApolloProtobufjs.lightMod

import org.scalablytyped.runtime.StringDictionary
import typings.atApolloProtobufjs.atApolloProtobufjsMod.Codegen
import typings.atApolloProtobufjs.atApolloProtobufjsMod.IType
import typings.atApolloProtobufjs.atApolloProtobufjsMod.TypeDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/protobufjs/light", "Type")
@js.native
class Type protected ()
  extends typings.atApolloProtobufjs.atApolloProtobufjsMod.Type {
  /**
    * Constructs a new reflected message type instance.
    * @param name Message name
    * @param [options] Declared options
    */
  def this(name: String) = this()
  def this(name: String, options: StringDictionary[js.Any]) = this()
}

/* static members */
@JSImport("@apollo/protobufjs/light", "Type")
@js.native
object Type extends js.Object {
  /**
    * Type decorator (TypeScript).
    * @param [typeName] Type name, defaults to the constructor's name
    * @returns Decorator function
    */
  def d[T /* <: typings.atApolloProtobufjs.atApolloProtobufjsMod.Message[T] */](): TypeDecorator[T] = js.native
  def d[T /* <: typings.atApolloProtobufjs.atApolloProtobufjsMod.Message[T] */](typeName: String): TypeDecorator[T] = js.native
  /**
    * Creates a message type from a message type descriptor.
    * @param name Message name
    * @param json Message type descriptor
    * @returns Created message type
    */
  def fromJSON(name: String, json: IType): typings.atApolloProtobufjs.atApolloProtobufjsMod.Type = js.native
  /**
    * Generates a constructor function for the specified type.
    * @param mtype Message type
    * @returns Codegen instance
    */
  def generateConstructor(mtype: typings.atApolloProtobufjs.atApolloProtobufjsMod.Type): Codegen = js.native
}

