package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Sequence")
@js.native
class Sequence protected () extends js.Object {
  val Application: Application = js.native
  val Count: scala.Double = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.Sequence_typekey`: Sequence = js.native
  /**
           * @param PowerPoint.MsoAnimateByLevel [Level=0]
           * @param PowerPoint.MsoAnimTriggerType [trigger=1]
           * @param number [Index=-1]
           */
  def AddEffect(Shape: Shape, effectId: MsoAnimEffect): Effect = js.native
  /**
           * @param PowerPoint.MsoAnimateByLevel [Level=0]
           * @param PowerPoint.MsoAnimTriggerType [trigger=1]
           * @param number [Index=-1]
           */
  def AddEffect(Shape: Shape, effectId: MsoAnimEffect, Level: MsoAnimateByLevel): Effect = js.native
  /**
           * @param PowerPoint.MsoAnimateByLevel [Level=0]
           * @param PowerPoint.MsoAnimTriggerType [trigger=1]
           * @param number [Index=-1]
           */
  def AddEffect(Shape: Shape, effectId: MsoAnimEffect, Level: MsoAnimateByLevel, trigger: MsoAnimTriggerType): Effect = js.native
  /**
           * @param PowerPoint.MsoAnimateByLevel [Level=0]
           * @param PowerPoint.MsoAnimTriggerType [trigger=1]
           * @param number [Index=-1]
           */
  def AddEffect(
    Shape: Shape,
    effectId: MsoAnimEffect,
    Level: MsoAnimateByLevel,
    trigger: MsoAnimTriggerType,
    Index: scala.Double
  ): Effect = js.native
  /**
           * @param string [bookmark='']
           * @param PowerPoint.MsoAnimateByLevel [Level=0]
           */
  def AddTriggerEffect(pShape: Shape, effectId: MsoAnimEffect, trigger: MsoAnimTriggerType, pTriggerShape: Shape): Effect = js.native
  /**
           * @param string [bookmark='']
           * @param PowerPoint.MsoAnimateByLevel [Level=0]
           */
  def AddTriggerEffect(
    pShape: Shape,
    effectId: MsoAnimEffect,
    trigger: MsoAnimTriggerType,
    pTriggerShape: Shape,
    bookmark: java.lang.String
  ): Effect = js.native
  /**
           * @param string [bookmark='']
           * @param PowerPoint.MsoAnimateByLevel [Level=0]
           */
  def AddTriggerEffect(
    pShape: Shape,
    effectId: MsoAnimEffect,
    trigger: MsoAnimTriggerType,
    pTriggerShape: Shape,
    bookmark: java.lang.String,
    Level: MsoAnimateByLevel
  ): Effect = js.native
  /** @param number [Index=-1] */
  def Clone(Effect: Effect): Effect = js.native
  /** @param number [Index=-1] */
  def Clone(Effect: Effect, Index: scala.Double): Effect = js.native
  /**
           * @param Office.MsoRGBType [DimColor=0]
           * @param PowerPoint.PpColorSchemeIndex [DimSchemeColor=0]
           */
  def ConvertToAfterEffect(Effect: Effect, After: MsoAnimAfterEffect): Effect = js.native
  /**
           * @param Office.MsoRGBType [DimColor=0]
           * @param PowerPoint.PpColorSchemeIndex [DimSchemeColor=0]
           */
  def ConvertToAfterEffect(Effect: Effect, After: MsoAnimAfterEffect, DimColor: activexDashOfficeLib.OfficeNs.MsoRGBType): Effect = js.native
  /**
           * @param Office.MsoRGBType [DimColor=0]
           * @param PowerPoint.PpColorSchemeIndex [DimSchemeColor=0]
           */
  def ConvertToAfterEffect(
    Effect: Effect,
    After: MsoAnimAfterEffect,
    DimColor: activexDashOfficeLib.OfficeNs.MsoRGBType,
    DimSchemeColor: PpColorSchemeIndex
  ): Effect = js.native
  def ConvertToAnimateBackground(Effect: Effect, AnimateBackground: activexDashOfficeLib.OfficeNs.MsoTriState): Effect = js.native
  def ConvertToAnimateInReverse(Effect: Effect, animateInReverse: activexDashOfficeLib.OfficeNs.MsoTriState): Effect = js.native
  def ConvertToBuildLevel(Effect: Effect, Level: MsoAnimateByLevel): Effect = js.native
  def ConvertToTextUnitEffect(Effect: Effect, unitEffect: MsoAnimTextUnitEffect): Effect = js.native
  def FindFirstAnimationFor(Shape: Shape): Effect = js.native
  def FindFirstAnimationForClick(click: scala.Double): Effect = js.native
  def Item(Index: scala.Double): Effect = js.native
}

