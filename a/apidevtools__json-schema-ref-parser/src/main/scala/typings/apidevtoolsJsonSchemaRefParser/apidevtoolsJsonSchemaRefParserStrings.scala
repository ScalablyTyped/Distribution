package typings.apidevtoolsJsonSchemaRefParser

import typings.apidevtoolsJsonSchemaRefParser.mod.JSONParserErrorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apidevtoolsJsonSchemaRefParserStrings {
  
  @scala.inline
  def EINVALIDPOINTER: EINVALIDPOINTER = "EINVALIDPOINTER".asInstanceOf[EINVALIDPOINTER]
  
  @scala.inline
  def EMISSINGPOINTER: EMISSINGPOINTER = "EMISSINGPOINTER".asInstanceOf[EMISSINGPOINTER]
  
  @scala.inline
  def EPARSER: EPARSER = "EPARSER".asInstanceOf[EPARSER]
  
  @scala.inline
  def ERESOLVER: ERESOLVER = "ERESOLVER".asInstanceOf[ERESOLVER]
  
  @scala.inline
  def EUNKNOWN: EUNKNOWN = "EUNKNOWN".asInstanceOf[EUNKNOWN]
  
  @scala.inline
  def EUNMATCHEDPARSER: EUNMATCHEDPARSER = "EUNMATCHEDPARSER".asInstanceOf[EUNMATCHEDPARSER]
  
  @scala.inline
  def EUNMATCHEDRESOLVER: EUNMATCHEDRESOLVER = "EUNMATCHEDRESOLVER".asInstanceOf[EUNMATCHEDRESOLVER]
  
  @scala.inline
  def ignore: ignore = "ignore".asInstanceOf[ignore]
  
  @js.native
  sealed trait EINVALIDPOINTER extends JSONParserErrorType
  
  @js.native
  sealed trait EMISSINGPOINTER extends JSONParserErrorType
  
  @js.native
  sealed trait EPARSER extends JSONParserErrorType
  
  @js.native
  sealed trait ERESOLVER extends JSONParserErrorType
  
  @js.native
  sealed trait EUNKNOWN extends JSONParserErrorType
  
  @js.native
  sealed trait EUNMATCHEDPARSER extends JSONParserErrorType
  
  @js.native
  sealed trait EUNMATCHEDRESOLVER extends JSONParserErrorType
  
  @js.native
  sealed trait ignore extends js.Object
}
