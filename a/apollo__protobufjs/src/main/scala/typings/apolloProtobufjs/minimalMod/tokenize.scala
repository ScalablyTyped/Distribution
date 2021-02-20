package typings.apolloProtobufjs.minimalMod

import typings.apolloProtobufjs.mod.ITokenizerHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokenize {
  
  @JSImport("@apollo/protobufjs/minimal", "tokenize")
  @js.native
  def apply(source: String, alternateCommentMode: Boolean): ITokenizerHandle = js.native
  
  /**
    * Unescapes a string.
    * @param str String to unescape
    * @returns Unescaped string
    */
  @JSImport("@apollo/protobufjs/minimal", "tokenize.unescape")
  @js.native
  def unescape(str: String): String = js.native
}
