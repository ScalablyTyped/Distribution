package typings.adone.adoneNs.mathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a set of bits
  */
@JSGlobal("adone.math.BitSet")
@js.native
class BitSet protected () extends js.Object {
  /**
    * Creates a new bitset from a dehydrated bitset
    */
  def this(key: String) = this()
  /**
    * Creates a new bitset of n bits
    */
  def this(n: Double) = this()
  /**
    * Performs a bitwise AND on 2 bitsets or 1 bitset and 1 index.
    * Both bitsets must have the same number of words, no length check is performed to prevent and overflow.
    */
  def and(value: Double): BitSet = js.native
  def and(value: BitSet): BitSet = js.native
  /**
    * Performs a circular shift bitset by an offset
    *
    * @param n number of positions that the bitset that will be shifted to the right. Using a negative number will result in a left shift.
    */
  def circularShift(n: Double): BitSet = js.native
  /**
    * Clears the entire bitset
    */
  def clear(): Boolean = js.native
  /**
    * Turns the bitset into a comma separated string that skips leading & trailing 0 words.
    * Ends with the number of leading 0s and MAX_BIT.
    * Useful if you need the bitset to be an object key (eg dynamic programming).
    * Can rehydrate by passing the result into the constructor
    */
  def dehydrate(): String = js.native
  /**
    * Finds first set bit (useful for processing queues, breadth-first tree searches, etc.).
    * Returns -1 if not found
    *
    * @param startWord the word to start with (only used internally by nextSetBit)
    */
  def ffs(): Double = js.native
  def ffs(startWord: Double): Double = js.native
  /**
    * Finds first zero (unset bit).
    * Returns -1 if not found
    *
    * @param startWord the word to start with (only used internally by nextUnsetBit)
    */
  def ffz(): Double = js.native
  def ffz(startWord: Double): Double = js.native
  /**
    * Finds last set bit.
    * Returns -1 if not found
    *
    * @param startWord the word to start with (only used internally by previousSetBit)
    */
  def fls(): Double = js.native
  def fls(startWord: Double): Double = js.native
  /**
    * Finds last zero (unset bit).
    * Returns -1 if not found
    *
    * @param startWord the word to start with (only used internally by previousUnsetBit)
    */
  def flz(): Double = js.native
  def flz(startWord: Double): Double = js.native
  /**
    * Runs a custom function on every set bit.
    * Faster than iterating over the entire bitset with a get().
    * If the callback returns `false` it stops iterating.
    */
  def forEach(callback: js.Function1[/* idx */ Double, Unit | Boolean]): Unit = js.native
  /**
    * Checks whether a bit at a specific index is set
    */
  def get(idx: Double): Boolean = js.native
  /**
    * Gets the cardinality (count of set bits) for the entire bitset
    */
  def getCardinality(): Double = js.native
  /**
    * Gets the indices of all set bits
    */
  def getIndices(): js.Array[Double] = js.native
  /**
    * Quickly determines if a bitset is empty
    */
  def isEmpty(): Boolean = js.native
  /**
    * Quickly determines if both bitsets are equal (faster than checking if the XOR of the two is === 0).
    * Both bitsets must have the same number of words, no length check is performed to prevent and overflow.
    */
  def isEqual(other: BitSet): Boolean = js.native
  /**
    * Checks if one bitset is subset of another.
    */
  def isSubsetOf(other: BitSet): Boolean = js.native
  /**
    * Finds first set bit, starting at a given index.
    * Return -1 if not found
    *
    * @param idx the starting index for the next set bit
    */
  def nextSetBit(idx: Double): Double = js.native
  /**
    * Finds first unset bit, starting at a given index.
    * Return -1 if not found
    *
    * @param idx the starting index for the next unset bit
    */
  def nextUnsetBit(idx: Double): Double = js.native
  /**
    * Performs a bitwise OR on 2 bitsets or 1 bitset and 1 index.
    * Both bitsets must have the same number of words, no length check is performed to prevent and overflow.
    */
  def or(value: Double): BitSet = js.native
  def or(value: BitSet): BitSet = js.native
  /**
    * Finds last set bit, up to a given index.
    * Returns -1 if not found
    *
    * @param idx the starting index for the next unset bit (going in reverse)
    */
  def previousSetBit(idx: Double): Double = js.native
  /**
    * Finds last unset bit, up to a given index.
    * Returns -1 if not found
    */
  def previousUnsetBit(idx: Double): Double = js.native
  /**
    * Reads an unsigned integer of the given bits from the given offset
    *
    * @param bits number of bits, 1 by default
    * @param offset offset, 0 by default
    */
  def readUInt(): Double = js.native
  def readUInt(bits: Double): Double = js.native
  def readUInt(bits: Double, offset: Double): Double = js.native
  /**
    * Sets a single bit.
    * Returns true if set was successfull
    */
  def set(idx: Double): Boolean = js.native
  /**
    * Sets a range of bits.
    * Returns true if set was successfull
    */
  def setRange(from: Double, to: Double): Boolean = js.native
  /**
    * Converts the bitset to a math.Long number
    */
  def toLong(): Long = js.native
  /**
    * Toggles a single bit
    */
  def toggle(idx: Double): Boolean = js.native
  /**
    * Toggles a range of bits
    */
  def toggleRange(from: Double, to: Double): Boolean = js.native
  /**
    * Unsets a single bit.
    * Returns true if unset was successfull
    */
  def unset(idx: Double): Boolean = js.native
  /**
    * Unsets a range of bits.
    * Returns true if unset was successfull
    */
  def unsetRange(from: Double, to: Double): Boolean = js.native
  /**
    * Writes the given unsigned integer
    *
    * @param val integer
    * @param bits number of bits to write, 1 by default
    * @param offset write offset, 0 by default
    */
  def writeUInt(`val`: Double): Unit = js.native
  def writeUInt(`val`: Double, bits: Double): Unit = js.native
  def writeUInt(`val`: Double, bits: Double, offset: Double): Unit = js.native
  /**
    * Performs a bitwise XOR on 2 bitsets or 1 bitset and 1 index.
    * Both bitsets must have the same number of words, no length check is performed to prevent and overflow.
    */
  def xor(value: Double): BitSet = js.native
  def xor(value: BitSet): BitSet = js.native
}

/* static members */
@JSGlobal("adone.math.BitSet")
@js.native
object BitSet extends js.Object {
  /**
    * Creates a new BitSet from the given math.Long number
    */
  def fromLong(l: Long): BitSet = js.native
}

