package typings.apolloProtobufjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object converter {
  
  @JSImport("@apollo/protobufjs", "converter")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Generates a plain object to runtime message converter specific to the specified message type.
    * @param mtype Message type
    * @returns Codegen instance
    */
  inline def fromObject(mtype: Type): Codegen = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(mtype.asInstanceOf[js.Any]).asInstanceOf[Codegen]
  
  /**
    * Generates a runtime message to plain object converter specific to the specified message type.
    * @param mtype Message type
    * @returns Codegen instance
    */
  inline def toObject(mtype: Type): Codegen = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(mtype.asInstanceOf[js.Any]).asInstanceOf[Codegen]
}
