package typings.acorn

import typings.acorn.mod.ecmaVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object acornStrings {
  
  @js.native
  sealed trait latest
    extends StObject
       with ecmaVersion
  inline def latest: latest = "latest".asInstanceOf[latest]
  
  @js.native
  sealed trait module extends StObject
  inline def module: module = "module".asInstanceOf[module]
  
  @js.native
  sealed trait never extends StObject
  inline def never: never = "never".asInstanceOf[never]
  
  @js.native
  sealed trait script extends StObject
  inline def script: script = "script".asInstanceOf[script]
}
