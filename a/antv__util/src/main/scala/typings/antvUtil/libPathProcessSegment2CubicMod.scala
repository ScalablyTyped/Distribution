package typings.antvUtil

import typings.antvUtil.libPathTypesMod.CSegment_
import typings.antvUtil.libPathTypesMod.MSegment_
import typings.antvUtil.libPathTypesMod.ParserParams
import typings.antvUtil.libPathTypesMod.PathSegment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPathProcessSegment2CubicMod {
  
  @JSImport("@antv/util/lib/path/process/segment-2-cubic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def segmentToCubic(segment: PathSegment, params: ParserParams): CSegment_ | MSegment_ = (^.asInstanceOf[js.Dynamic].applyDynamic("segmentToCubic")(segment.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[CSegment_ | MSegment_]
}
