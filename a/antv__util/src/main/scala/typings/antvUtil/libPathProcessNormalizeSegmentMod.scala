package typings.antvUtil

import typings.antvUtil.libPathTypesMod.NormalSegment
import typings.antvUtil.libPathTypesMod.PathSegment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPathProcessNormalizeSegmentMod {
  
  @JSImport("@antv/util/lib/path/process/normalize-segment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normalizeSegment(segment: PathSegment, params: Any): NormalSegment = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeSegment")(segment.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[NormalSegment]
}
