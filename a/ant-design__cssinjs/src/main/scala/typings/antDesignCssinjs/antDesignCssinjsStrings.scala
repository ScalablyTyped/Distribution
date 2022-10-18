package typings.antDesignCssinjs

import typings.antDesignCssinjs.esStyleContextMod.HashPriority
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object antDesignCssinjsStrings {
  
  @js.native
  sealed trait client extends StObject
  inline def client: client = "client".asInstanceOf[client]
  
  @js.native
  sealed trait high
    extends StObject
       with HashPriority
  inline def high: high = "high".asInstanceOf[high]
  
  @js.native
  sealed trait low
    extends StObject
       with HashPriority
  inline def low: low = "low".asInstanceOf[low]
  
  @js.native
  sealed trait server extends StObject
  inline def server: server = "server".asInstanceOf[server]
}
