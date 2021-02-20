package typings.absSvgPath

import typings.absSvgPath.absSvgPathStrings.A
import typings.absSvgPath.absSvgPathStrings.C
import typings.absSvgPath.absSvgPathStrings.H
import typings.absSvgPath.absSvgPathStrings.L
import typings.absSvgPath.absSvgPathStrings.M
import typings.absSvgPath.absSvgPathStrings.Q
import typings.absSvgPath.absSvgPathStrings.S
import typings.absSvgPath.absSvgPathStrings.T
import typings.absSvgPath.absSvgPathStrings.V
import typings.absSvgPath.absSvgPathStrings.Z
import typings.absSvgPath.absSvgPathStrings.a_
import typings.absSvgPath.absSvgPathStrings.c_
import typings.absSvgPath.absSvgPathStrings.h_
import typings.absSvgPath.absSvgPathStrings.l_
import typings.absSvgPath.absSvgPathStrings.m_
import typings.absSvgPath.absSvgPathStrings.q_
import typings.absSvgPath.absSvgPathStrings.s_
import typings.absSvgPath.absSvgPathStrings.t_
import typings.absSvgPath.absSvgPathStrings.v_
import typings.absSvgPath.absSvgPathStrings.z_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("abs-svg-path", JSImport.Namespace)
  @js.native
  def apply(path: js.Array[AnyCommand]): js.Array[AbsAnyCommand] = js.native
  
  type AbsAnyCommand = AbsMoveCommand | AbsLineCommand | AbsHorizontalCommand | AbsVerticalCommand | AbsClosePathCommand | AbsBezierCurveCommand | AbsFollowingBezierCurveCommand | AbsQuadraticCurveCommand | AbsFollowingQuadraticCurveCommand | AbsArcCommand
  
  type AbsArcCommand = js.Tuple8[A, Double, Double, Double, Double, Double, Double, Double]
  
  type AbsBezierCurveCommand = js.Tuple7[C, Double, Double, Double, Double, Double, Double]
  
  type AbsClosePathCommand = js.Array[Z]
  
  type AbsFollowingBezierCurveCommand = js.Tuple5[S, Double, Double, Double, Double]
  
  type AbsFollowingQuadraticCurveCommand = js.Tuple3[T, Double, Double]
  
  type AbsHorizontalCommand = js.Tuple2[H, Double]
  
  type AbsLineCommand = js.Tuple3[L, Double, Double]
  
  type AbsMoveCommand = js.Tuple3[M, Double, Double]
  
  type AbsQuadraticCurveCommand = js.Tuple5[Q, Double, Double, Double, Double]
  
  type AbsVerticalCommand = js.Tuple2[V, Double]
  
  type AnyCommand = MoveCommand | LineCommand | HorizontalCommand | VerticalCommand | ClosePathCommand | BezierCurveCommand | FollowingBezierCurveCommand | QuadraticCurveCommand | FollowingQuadraticCurveCommand | ArcCommand
  
  type ArcCommand = RelArcCommand | AbsArcCommand
  
  type BezierCurveCommand = RelBezierCurveCommand | AbsBezierCurveCommand
  
  type ClosePathCommand = RelClosePathCommand | AbsClosePathCommand
  
  type FollowingBezierCurveCommand = RelFollowingBezierCurveCommand | AbsFollowingBezierCurveCommand
  
  type FollowingQuadraticCurveCommand = RelFollowingQuadraticCurveCommand | AbsFollowingQuadraticCurveCommand
  
  type HorizontalCommand = RelHorizontalCommand | AbsHorizontalCommand
  
  type LineCommand = RelLineCommand | AbsLineCommand
  
  type MoveCommand = RelMoveCommand | AbsMoveCommand
  
  type QuadraticCurveCommand = RelQuadraticCurveCommand | AbsQuadraticCurveCommand
  
  type RelArcCommand = js.Tuple8[a_, Double, Double, Double, Double, Double, Double, Double]
  
  type RelBezierCurveCommand = js.Tuple7[c_, Double, Double, Double, Double, Double, Double]
  
  type RelClosePathCommand = js.Array[z_]
  
  type RelFollowingBezierCurveCommand = js.Tuple5[s_, Double, Double, Double, Double]
  
  type RelFollowingQuadraticCurveCommand = js.Tuple3[t_, Double, Double]
  
  type RelHorizontalCommand = js.Tuple2[h_, Double]
  
  type RelLineCommand = js.Tuple3[l_, Double, Double]
  
  type RelMoveCommand = js.Tuple3[m_, Double, Double]
  
  type RelQuadraticCurveCommand = js.Tuple5[q_, Double, Double, Double, Double]
  
  type RelVerticalCommand = js.Tuple2[v_, Double]
  
  type VerticalCommand = RelVerticalCommand | AbsVerticalCommand
}
