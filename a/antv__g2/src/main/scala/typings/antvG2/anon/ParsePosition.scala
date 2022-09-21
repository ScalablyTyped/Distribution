package typings.antvG2.anon

import typings.antvG2.libInterfaceMod.Datum
import typings.antvG2.libInterfaceMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParsePosition extends StObject {
  
  def parsePosition(position: js.Tuple2[String | Double, String | Double]): Point = js.native
  def parsePosition(position: Datum): Point = js.native
}
