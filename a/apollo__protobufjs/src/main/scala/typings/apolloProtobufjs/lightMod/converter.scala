package typings.apolloProtobufjs.lightMod

import typings.apolloProtobufjs.mod.Codegen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object converter {
  
  /**
    * Generates a plain object to runtime message converter specific to the specified message type.
    * @param mtype Message type
    * @returns Codegen instance
    */
  @JSImport("@apollo/protobufjs/light", "converter.fromObject")
  @js.native
  def fromObject(mtype: typings.apolloProtobufjs.mod.Type): Codegen = js.native
  
  /**
    * Generates a runtime message to plain object converter specific to the specified message type.
    * @param mtype Message type
    * @returns Codegen instance
    */
  @JSImport("@apollo/protobufjs/light", "converter.toObject")
  @js.native
  def toObject(mtype: typings.apolloProtobufjs.mod.Type): Codegen = js.native
}
