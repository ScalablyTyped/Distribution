package typings.aframe.mod.global.AFRAME.THREE

import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("AFRAME.THREE.EdgesGeometry")
@js.native
/**
  * Create a new instance of {@link EdgesGeometry}
  * @param geometry Any geometry object. Default `null`.
  * @param thresholdAngle An edge is only rendered if the angle (in degrees) between the face normals of the adjoining faces exceeds this value. Expects a `Integer`. Default `1` _degree_.
  */
open class EdgesGeometry[TBufferGeometry /* <: typings.three.srcCoreBufferGeometryMod.BufferGeometry[NormalBufferAttributes] */] ()
  extends typings.three.mod.EdgesGeometry[TBufferGeometry]
