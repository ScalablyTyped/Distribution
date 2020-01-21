package typings.apolloCodegen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.apolloCodegen.apolloCodegenStrings.json
  - typings.apolloCodegen.apolloCodegenStrings.swift
  - typings.apolloCodegen.apolloCodegenStrings.`ts-legacy`
  - typings.apolloCodegen.apolloCodegenStrings.`typescript-legacy`
  - typings.apolloCodegen.apolloCodegenStrings.`flow-legacy`
  - typings.apolloCodegen.apolloCodegenStrings.scala_
  - typings.apolloCodegen.apolloCodegenStrings.flow
  - typings.apolloCodegen.apolloCodegenStrings.typescript
  - typings.apolloCodegen.apolloCodegenStrings.ts
*/
trait TargetType extends js.Object

object TargetType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def flow: typings.apolloCodegen.apolloCodegenStrings.flow = this.cast("flow")
  @scala.inline
  def `flow-legacy`: typings.apolloCodegen.apolloCodegenStrings.`flow-legacy` = this.cast("flow-legacy")
  @scala.inline
  def json: typings.apolloCodegen.apolloCodegenStrings.json = this.cast("json")
  @JSName("scala")
  @scala.inline
  def scala_ : typings.apolloCodegen.apolloCodegenStrings.scala_ = this.cast("scala")
  @scala.inline
  def swift: typings.apolloCodegen.apolloCodegenStrings.swift = this.cast("swift")
  @scala.inline
  def ts: typings.apolloCodegen.apolloCodegenStrings.ts = this.cast("ts")
  @scala.inline
  def `ts-legacy`: typings.apolloCodegen.apolloCodegenStrings.`ts-legacy` = this.cast("ts-legacy")
  @scala.inline
  def typescript: typings.apolloCodegen.apolloCodegenStrings.typescript = this.cast("typescript")
  @scala.inline
  def `typescript-legacy`: typings.apolloCodegen.apolloCodegenStrings.`typescript-legacy` = this.cast("typescript-legacy")
}

