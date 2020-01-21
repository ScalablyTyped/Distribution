package typings.apolloCodegen

import typings.apolloCodegen.mod.TargetType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object apolloCodegenStrings {
  @js.native
  sealed trait flow extends TargetType
  
  @js.native
  sealed trait `flow-legacy` extends TargetType
  
  @js.native
  sealed trait json extends TargetType
  
  @js.native
  sealed trait scala_ extends TargetType
  
  @js.native
  sealed trait swift extends TargetType
  
  @js.native
  sealed trait ts extends TargetType
  
  @js.native
  sealed trait `ts-legacy` extends TargetType
  
  @js.native
  sealed trait typescript extends TargetType
  
  @js.native
  sealed trait `typescript-legacy` extends TargetType
  
  @scala.inline
  def flow: flow = "flow".asInstanceOf[flow]
  @scala.inline
  def `flow-legacy`: `flow-legacy` = "flow-legacy".asInstanceOf[`flow-legacy`]
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  @scala.inline
  def scala_ : scala_ = "scala".asInstanceOf[scala_]
  @scala.inline
  def swift: swift = "swift".asInstanceOf[swift]
  @scala.inline
  def ts: ts = "ts".asInstanceOf[ts]
  @scala.inline
  def `ts-legacy`: `ts-legacy` = "ts-legacy".asInstanceOf[`ts-legacy`]
  @scala.inline
  def typescript: typescript = "typescript".asInstanceOf[typescript]
  @scala.inline
  def `typescript-legacy`: `typescript-legacy` = "typescript-legacy".asInstanceOf[`typescript-legacy`]
}

