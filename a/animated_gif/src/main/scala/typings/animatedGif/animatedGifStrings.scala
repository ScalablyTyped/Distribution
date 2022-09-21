package typings.animatedGif

import typings.animatedGif.mod.DitheringMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animatedGifStrings {
  
  @js.native
  sealed trait bayer
    extends StObject
       with DitheringMethod
  inline def bayer: bayer = "bayer".asInstanceOf[bayer]
  
  @js.native
  sealed trait closest
    extends StObject
       with DitheringMethod
  inline def closest: closest = "closest".asInstanceOf[closest]
  
  @js.native
  sealed trait floyd
    extends StObject
       with DitheringMethod
  inline def floyd: floyd = "floyd".asInstanceOf[floyd]
}
